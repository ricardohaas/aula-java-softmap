package edu.softmap.exercicio36;

public class ThreadContador extends Thread{
	Editor editor;
	
	public ThreadContador(Editor e){
		this.editor = e;
	}
	
	public void run(){
		while(true){
			try {
				int textSize = this.editor.getContentLenght();
				String textSizeLabel = textSize + " caractere(s)";
				this.editor.setCharacterCount( textSizeLabel );
				sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
