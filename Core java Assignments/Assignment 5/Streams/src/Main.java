import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<FruitEx> fruits = Arrays.asList(new FruitEx("Banana", 60 , 30 , "Yellow" )
	                , new FruitEx("Pineapple", 100 , 80 , "Green")
	                , new FruitEx("Apple", 110 , 90 , "Red" )
	                , new FruitEx("Mango", 120 , 100 , "Yellow" )
	                , new FruitEx("Cherry", 111 , 70 , "Red")
	                , new FruitEx("Strawberry", 85 , 120 , "Red")
	                );

			//Collections.sort(fruits, ( o1,  o2) ->(int) (o1.getColor().compareTo(o2.getColor())));
			//fruits.stream().sorted(comparator).forEach(System.out::println);
		 //fruits.stream().forEach(t->System.out.println(t));
		 System.out.println("fruits name who has calories < 100 sorted in descending order of calories.");
	       
	        List<FruitEx> L = fruits.stream().filter(p -> p.getCalories() < 100).sorted(new Comparator<FruitEx>() {
	            @Override
	            public int compare(FruitEx o1, FruitEx o2) {
	                return o2.getCalories() > o1.getCalories() ? 1 : -1;
	            }
	        }).collect(Collectors.toList());
	        L.forEach(System.out::println);
	
	System.out.println("-------List wise fruit names-----");
			Collections.sort(fruits, ( o1,  o2) ->(int) (o1.getColor().compareTo(o2.getColor())));
			System.out.println(fruits);
			System.out.println("-------Red color fruits sorted with price-----");
			
			 fruits.stream().filter(p -> p.getColor().equalsIgnoreCase("Red")).sorted(new Comparator<FruitEx>() {
	            @Override
	            public int compare(FruitEx o1, FruitEx o2) {
	                return o1.getPrice() > o2.getPrice() ? 1 : -1;
	            }
	        }).forEach(System.out::println);
			 
			System.out.println("News queries.."); 
			
			 List<News> nw = Arrays.asList(new News(111, "Shweta ", "Aarti" , "Its a breaking news about budget" )
		                , new News(112, "Aarti" , "Shweta", "This news relates buisness, politics, sports and the budget")
		                , new News(113, "Girish" , "Kirti" , "That's a great news.." )
		                , new News(111, "Shweta" , "Nikita" , "It's very shocking" )
		                , new News(111, "Shweta" , "Shweta" , "What will be the budget ")
		                , new News(116, "Kirti" , "Girish" , "I don't know about this budget article..")
		                );
			 
				System.out.println("------newsId who received maximum comments---------"); 

			 Integer newsId = nw.stream()
						.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
				System.out.println(newsId);
				
				System.out.println("------How many times Budget word came in all comments---------"); 
				Long wordCount = nw.stream().filter(news1 -> news1.getComment().contains("budget")).count();
				System.out.println(wordCount);
				
				System.out.println("------commentByUser wise number of comments---------"); 
				Map<String,Long> commentByUser = nw.stream()
						.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting())); 
				System.out.println(commentByUser);
				
				
				System.out.println("Transactions queries..");
				
				
				List<Transaction> transactions = Arrays.asList(  new Transaction(new Trader("Shweta","Solapur") , 2017 , 32000)
			               ,new Transaction(new Trader("Supriya","Pune"),2020,15000)
			               ,new Transaction(new Trader("Anuradha","Hyderabad"),2021 , 10000)
			               ,new Transaction(new Trader("Rashmi","Indore"),2011 , 20000)
			               ,new Transaction(new Trader("Govind","Pune"),2019, 22000)
			               ,new Transaction(new Trader("Mayuri","Mumbai"),2021,25000)
			               ,new Transaction(new Trader("Sonu","Delhi"),2011 , 12000)
			               ,new Transaction(new Trader("Kirti","Solapur"),2020 , 38000)
			               );

				System.out.println("------Transactions in 2011------");

				 transactions.stream().filter(p -> p.getYear() == 2011).sorted(new Comparator<Transaction>() {
			            @Override
			            public int compare(Transaction o1, Transaction o2) {
			                return o2.getValue() < o1.getValue() ? 1 : -1;
			            }
			        }).forEach(System.out::println);
				 
					System.out.println("------Unique Cities------");
					List<String> uniqueCities=transactions.stream()
							.map(Transaction::getTrader)
							.map(Trader::getCity)
							.distinct()
							.collect(Collectors.toList());
					System.out.println(uniqueCities);
					
					System.out.println("------Traders from Pune------");
					List<Trader> name=transactions.stream()
							.filter(city->city.getTrader().getCity().equals("Pune"))
							.map(Transaction::getTrader)
							.sorted(Comparator.comparing(Trader::getName))
							.collect(Collectors.toList());
					System.out.println(name);
					
					System.out.println("------all Traders name sorted in ascending order------");
					String tradername=transactions.stream()
							.map(Transaction::getTrader)
							.sorted(Comparator.comparing(Trader::getName))
							.collect(Collectors.toList()).toString();
					System.out.println(tradername);
					
					
					System.out.println("------Traders from Indore------");
					Optional<Trader> indoreTraders = transactions.stream()
							.filter(city -> city.getTrader().getCity() == "Indore")
							.map(Transaction::getTrader)	
							.findAny();
					System.out.println(indoreTraders);
					
					
					System.out.println("------Traders from Delhi------");
					Optional<Transaction> delhiTraders =transactions
							.stream()
							.filter(cityName->cityName.getTrader().getCity().equalsIgnoreCase("delhi"))
							.findAny();
					System.out.println(delhiTraders);
					
					System.out.println("------Highest transaction------");
					Integer  highestTransaction = transactions.stream()
							.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
							.entrySet()
							.stream()
							.max(Map.Entry.comparingByKey()).get().getKey();;
					System.out.println("Transaction with Highest Value :"+highestTransaction);
					
					
					
					System.out.println("------Smallest transaction------");
					Integer  smallestTransaction = transactions.stream()
							.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
							.entrySet()
							.stream()
							.min(Map.Entry.comparingByKey()).get().getKey();;
					System.out.println("Transaction with Smallest Value :"+ smallestTransaction);

	

					
					

					
					
			
					

				
				
				
				
				
				
				
				
	}
	

}


