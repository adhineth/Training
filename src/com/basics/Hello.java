package com.basics;

public class Hello {
    public static void main(String[] args) {
        String info = "welcome to java";        //Assigning the value "welcome to java" to info
        System.out.println(info);               //printing info
    }
}
/*
3. remove main/String[]/Hello     -- not letting us to click on Run at all
   remove System.Out              -- cannot resolve method println
   remove println                 -- error identifier expected

4. remove ; 1st { 2nd { 1st " 2nd " 1st } 2nd } subsequently  -- exceptions error

5. Misspell main/String          -- not letting us to click run
   Misspell System.out/println   -- error
   Misspell HelloWorld           -- Error obvious, but the options that are given to me is
                                    a. "Rename the Class name"
                                    b. "not allowing me to go public class"
                                    c. "modifier private/protected also not allowed"
                                    d. "case sensitive"
 */