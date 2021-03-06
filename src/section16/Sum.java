package section16;

public class Sum implements Expression {
	// 被加算数
	Expression augend;

	// 加算
	Expression addend;

	Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
}
