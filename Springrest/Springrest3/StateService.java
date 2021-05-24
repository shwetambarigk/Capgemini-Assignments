package springrest_3.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import springrest_3.models.State;

@Service
public class StateServiceImpl implements StateService {

	private static final State[] statesArray = new State[] { new State("111", "XY", "ABCD", "INDIA"),
			new State("112", "XY", "ABCD", "INDIA"), new State("113", "PQ", "Dorado", "INDIA")
			 };
	
	private static final ArrayList<State> states = new ArrayList<>(Arrays.asList(statesArray));
	
	private static final Map<String, State> stateMap = states.stream()
			.collect(Collectors.toMap(State::getZipCode, state -> state));

	@Override
	public State getStateByZipCode(String zipcode) {
		return stateMap.get(zipcode);
	}

	@Override
	public void AddState(State state) {
		stateMap.put(state.getZipCode(), state);
	}

	@Override
	public State deleteStatebyZip(String zipcode) {
		State state = stateMap.remove(zipcode);
		return state;
	}

}