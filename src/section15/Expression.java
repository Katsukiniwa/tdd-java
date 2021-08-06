package section15;

interface Expression {
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);
}
