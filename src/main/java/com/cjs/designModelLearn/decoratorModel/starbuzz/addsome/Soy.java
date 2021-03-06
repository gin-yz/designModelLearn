package com.cjs.designModelLearn.decoratorModel.starbuzz.addsome;

import com.cjs.designModelLearn.decoratorModel.starbuzz.Beverage;
import com.cjs.designModelLearn.decoratorModel.starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
