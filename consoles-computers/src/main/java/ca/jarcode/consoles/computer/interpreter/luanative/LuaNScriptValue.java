package ca.jarcode.consoles.computer.interpreter.luanative;

import ca.jarcode.consoles.computer.interpreter.interfaces.ScriptFunction;
import ca.jarcode.consoles.computer.interpreter.interfaces.ScriptValue;

public class LuaNScriptValue implements ScriptValue, ScriptFunction {

	// this class has it's own members, but they are implemented in C

	// this class has no constructor, but it still needs to be assigned data on creation only visible from C

	// instances of this class are only safely created created via the function factory (also native)

	// unlike the LuaJ implementation, a value and a function are the same instance
	public native Object translateObj();
	public native boolean canTranslateObj();
	public native String translateString();
	public native boolean canTranslateString();
	public native long translateLong();
	public native boolean canTranslateLong();
	public native short translateShort();
	public native boolean canTranslateShort();
	public native byte translateByte();
	public native boolean canTranslateByte();
	public native int translateInt();
	public native boolean canTranslateInt();
	public native float translateFloat();
	public native boolean canTranslateFloat();
	public native double translateDouble();
	public native boolean canTranslateDouble();
	public native boolean translateBoolean();
	public native boolean canTranslateBoolean();
	public native boolean isNull();
	public native boolean canTranslateArray();
	public native Object translateArray(Class arrClass);
	public native boolean isFunction();
	public ScriptFunction getAsFunction() { return this; }
	public native void set(ScriptValue key, ScriptValue value);
	public native ScriptValue get(ScriptValue key);
	public native ScriptValue call();

	public native ScriptValue call(ScriptValue... args);
	public ScriptValue getAsValue() { return this; }
}