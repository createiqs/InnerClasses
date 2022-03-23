package com.createiq.innerclasses;

public class Marks {
// employee ,leaves
	private int maths;
	private int science;
	private int history;

	public Marks(int maths, int science, int history) {
		this.maths = maths;
		this.science = science;
		this.history = history;
	}

	class Results {

		public void grade(double result) {

			if (result > 90 && result < 100) {
				System.out.println("grade A");
			} else if (result > 80 && result < 89) {
				System.out.println("grade B");
			} else if (result > 70 && result < 79) {
				System.out.println("grade C");
			} else if (result > 60 && result < 69) {
				System.out.println("grade D");
			} else if (result > 50 && result < 59) {
				System.out.println("grade E");
			} else {
				System.out.println("not qualified for next level.....");
			}

		}

	}

	public int getMaths() {
		return maths;
	}

	public int getScience() {
		return science;
	}

	public int getHistory() {
		return history;
	}

	public double total() {
		double total = this.maths + this.science + this.history;
//		System.out.println("total score: " + total);
		return total;
	}

	public double avg(double total) {
		double avg = total / 3;
		return Math.round(avg);
	}

	@Override
	public String toString() {
		return "Marks [maths=" + maths + ", science=" + science + ", history=" + history + "]";
	}

	public static void main(String[] args) {
//		Marks marksOne = new Marks(80, 75, 65);
//		double total = marksOne.total();
//		System.out.println(marksOne.avg(total));
//		double avg = marksOne.avg(total);
//
//		Marks.Results results = marksOne.new Results();
//		results.grade(avg);

	}

}
