package toolsQA.Serialization;

import java.io.Serializable;

public class Result implements Serializable {
	public Double compoundInterest(double principleAmount,int time,double rate,int compoundTimes) {
		return principleAmount*(Math.pow((1+rate/compoundTimes),compoundTimes*time));
	}
	public Double simpleInterest(double principleAmount,int time,double rate) {
		return (principleAmount*time*rate)/100;
	}

}
