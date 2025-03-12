package seminar3.solid.d;

public class Calculator {
	/*
	 * The violation of the Dependency Inversion Principle is noticeable in the Calculator class. 
	 * If we want to add a new calculator operation, 
	 * we must modify the Calculator class, 
	 * which violates the Open/Closed principle.
	 */

    public enum Operation{
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }


    /**
     * Performs a two numbers operation.
     * @param numA              First number.
     * @param numB              Second number.
     * @param operation         Type of operation.
     * @return                  Operation's result.
     */
    public double calculate(double numA, double numB, Operation operation){

        double result = 0;

        switch(operation){

            case ADD:
                AddOperation addOp = new AddOperation();
                result = addOp.add(numA, numB);
                break;
            case SUBTRACT:
                SubtractOperation subOp = new SubtractOperation();
                result = subOp.subtract(numA, numB);
                break;
            case MULTIPLY:
                MultiplyOperation multOp = new MultiplyOperation();
                result = multOp.multiply(numA, numB);
                break;
            case DIVIDE:
                DivideOperation divOp = new DivideOperation();
                result = divOp.divide(numA, numB);
                break;

        }

        return result;

    }
}