//Find if string is palindrome or not recursion.
//s=0,e=str.length()-1;
bool isPalindrome(String str, int s, int e) 
{ 
    // If there is only one character 
    if (s == e) 
        return true; 
    if (str.charAt(s) != str.charAt(e)) 
        return false; 
    if (s < e) 
        return isPalindrome(str, s + 1, e - 1); 
    return true; 
} 