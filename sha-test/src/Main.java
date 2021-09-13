
public class Main {
	public static void main(String[] args) {
		/* 암호화할 텍스트 */
		String[] text = {"kyeongha", "bn_sj2013", "jennierubyjane", "rookie_n_mukbob", "roses_are_rosie"};
		
		/* SHA256 암호화 결과 */
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i] +" : " + Sha256Test.testSHA256(text[i]));
		}
		
	}
}
