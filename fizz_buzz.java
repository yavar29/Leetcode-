class Solution {
  public List<String> fizzBuzz(int n) {

   
    List<String> ans = new ArrayList<String>();

    HashMap<Integer, String> fizzBizzDict =
        new HashMap<Integer, String>() {
          {
            put(3, "Fizz");
            put(5, "Buzz");
          }
        };

    for (int num = 1; num <= n; num++) {

      String numAnsStr = "";

      for (Integer key : fizzBizzDict.keySet()) {

        if (num % key == 0) {
          numAnsStr += fizzBizzDict.get(key);
        }
      }

      if (numAnsStr.equals("")) {

        numAnsStr += Integer.toString(num);
      }


      ans.add(numAnsStr);
    }

    return ans;
  }
}class Solution {
  public List<String> fizzBuzz(int n) {

   
    List<String> ans = new ArrayList<String>();

    HashMap<Integer, String> fizzBizzDict =
        new HashMap<Integer, String>() {
          {
            put(3, "Fizz");
            put(5, "Buzz");
          }
        };

    for (int num = 1; num <= n; num++) {

      String numAnsStr = "";

      for (Integer key : fizzBizzDict.keySet()) {

        if (num % key == 0) {
          numAnsStr += fizzBizzDict.get(key);
        }
      }

      if (numAnsStr.equals("")) {

        numAnsStr += Integer.toString(num);
      }


      ans.add(numAnsStr);
    }

    return ans;
  }
}