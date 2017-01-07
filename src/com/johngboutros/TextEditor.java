package com.johngboutros;

public class TextEditor {
	private SpellChecker spellChecker;
	private int year;
	private String name;
	private FontFormatter fontFormatter;

	public TextEditor(SpellChecker spellChecker, int year, String name) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
		this.year = year;
		this.name = name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	public void print() {
		System.out.println(year + " - " + name);
	}
	
	public void setFontFormatter(FontFormatter fontFormatter) {
		System.out.println("Inside setFontFormatter." );
		this.fontFormatter = fontFormatter;
	}
	
	public FontFormatter getFontFormatter() {
		return fontFormatter;
	}
	
	public void formatFont() {
		fontFormatter.formatFont();
	}
}