package com.java.eight.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaTester {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name  = "Runoob";
        Integer result = null;
        try {
            nashorn.put("name", "Runoob");
            nashorn.eval("print(name)");
            result = (Integer)nashorn.eval("10 + 2");

        }catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }
}
