class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        List<String> result = new ArrayList<>();

        if(digits==null || digits.length() == 0)
        {
            return result;
        }

        String[] phone = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        backtrack(result, phone,digits, 0, "");
        return result;
    }
    private void backtrack(List<String> result, String[] phone, String digits, int index, String current)
    {
        if(index==digits.length())
        {
            result.add(current);
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for(int i=0; i<letters.length(); i++)
        {
            backtrack(result, phone, digits, index+1, current+letters.charAt(i));
        }
    }
}