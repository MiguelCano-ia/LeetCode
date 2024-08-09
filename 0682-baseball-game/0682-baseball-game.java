class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> records = new Stack<>();

        for (String operation : operations) {
            switch (operation) {
                case "C" -> records.pop();
                case "D" -> records.push(records.peek() * 2);       
                case "+" -> records.push(records.peek() + records.elementAt(records.size() - 2));   
                default -> records.push(Integer.parseInt(operation));
            }
        }

        for (int record : records) {
            result += record;
        }

        return result;
    }
}