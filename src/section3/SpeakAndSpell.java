package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	private static Object otherwise;

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String word=JOptionPane.showInputDialog("spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
if(word.equals("mandlebrot")) {
	speak("TROLL");
}


		// 4. Otherwise say "wrong"
else  {
	speak("WRONG LOL");
}

		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
