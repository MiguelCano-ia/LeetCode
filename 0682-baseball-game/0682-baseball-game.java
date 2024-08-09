class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<String> records = new Stack<>();


        for (String operation : operations) {
            switch (operation) {
                case "C" -> records.pop();
                case "D" -> {
                    int peek = Integer.parseInt(records.peek());
                    int doublePeek = peek * 2;
                    records.push(String.valueOf(doublePeek));
                }
                case "+" -> {
                    int peek = Integer.parseInt(records.elementAt(records.toArray().length - 1));
                    int beforePeek = Integer.parseInt(records.elementAt(records.toArray().length - 2));
                    records.push(String.valueOf(peek + beforePeek));
                }
                case null, default -> records.push(operation);
            }
        }

        for (int j = 0; j < records.toArray().length; j++) {
            result += Integer.parseInt((String) records.toArray()[j]);
        }

        return result;
    }
}