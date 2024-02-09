package lamdas;

import java.util.List;
import java.util.stream.Collectors;

public class EvenDouble {
    public List<Double> evenDouble(List<Integer> nums){
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> Math.pow(n,2))
                .boxed()    //convert doublesream to double so that it can be collection to List<Double>
                .collect(Collectors.toList());
    }
}
