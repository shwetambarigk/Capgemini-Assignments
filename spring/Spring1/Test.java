<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">


       <!--   <bean class="springque_1.Address" name="address1">
            <property name="street" value="Street 1, Murarji peth" />
            <property name="city" value="Solapur" />
            <property name="country" value="India" />
            <property name="state" value="Maharashtra" />
            <property name="zip" value="613270" />
        </bean>

        <bean class="springque_1.Customer" name="customer1">
            <property name="customerName" value="Shweta" />
            <property name="customerId"  value="11704058" />
            <property name="customerContact" value="9882628704" />
            <property name="customerAddress" ref="address1" />
         </bean>
 -->
          <bean class="springque_1.Address" name="address2">
            <constructor-arg value="Station Street, Murarji peth" />
            <constructor-arg value="Allahabad" />
            <constructor-arg value="Pune" />
            <constructor-arg value="182330" />
            <constructor-arg value="India" />
        </bean>

        <bean class="springque_1.Customer" name="customer2">
            <constructor-arg value="222222" />
            <constructor-arg value="Aarti" />
            <constructor-arg value="789565452" />
            <constructor-arg ref="address2" />
        </bean>

</beans>