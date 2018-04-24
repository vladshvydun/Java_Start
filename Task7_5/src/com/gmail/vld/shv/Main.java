/*Считайте из текстового файла текст на английском языке и
выведите статистику по частоте использования букв в тексте
(т. е. буква — количество использований), причем первыми
должны выводиться буквы используемы чаще всего.
*/

package com.gmail.vld.shv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String text = loadFromFile(new File("William Shakespeare.txt"));
		char[] textArray = text.toCharArray();
		int length = textArray.length;

		for (int i = 65; i <= 90; i++) {
			int value = 0;
			char character = (char) i;
			System.out.print(character + " - ");
			for (int j = 0; j < length; j++) {
				if (character == textArray[j]) {
					value++;
				}
			}
			System.out.println(value);
		}
		for (int i = 97; i <= 122; i++) {
			int value = 0;
			char character = (char) i;
			System.out.print(character + " - ");
			for (int j = 0; j < length; j++) {
				if (character == textArray[j]) {
					value++;
				}
			}
			System.out.println(value);
		}

	}

	public static String loadFromFile(File file) {
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";

			for (; (text = br.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		return sb.toString();
	}

}
