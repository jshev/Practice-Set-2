package base;

public class MyInteger {
	
	int iValue;
	int otherInteger;
	
	MyInteger(int number) {
		iValue = number;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue/2==0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if (iValue/2==0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime() {
		for (int i=2; i<iValue; i++) {
			if (iValue%i==0)
				return false;
		}
			return true;
	}
	
	static boolean isEven(int number) {
		if (number/2==0)
			return true;
		else
			return false;
	}
	
	static boolean isOdd(int number) {
		if (number/2==0)
			return false;
		else
			return true;
	}
	
	static boolean isPrime(int number) {
		for (int i=2; i<number; i++) {
			if (number%i==0)
				return false;
		}
			return true;
	}
	
	static boolean isEven(MyInteger number) {
		if (number.iValue/2==0)
			return true;
		else
			return false;
	}
	
	static boolean isOdd(MyInteger number) {
		if (number.iValue/2==0)
			return false;
		else
			return true;
	}
	
	static boolean isPrime(MyInteger number) {
		for (int i=2; i<number.iValue; i++) {
			if (number.iValue%i==0)
				return false;
		}
			return true;
	}
	
	public boolean equals(int otherInteger) {
		if (this.iValue==otherInteger)
			return true;
		else
			return false;
	}
	
	public boolean equal(MyInteger otherInteger) {
		if (this.iValue == otherInteger.iValue)
			return true;
		else
			return false;
	}
	
}

// comment