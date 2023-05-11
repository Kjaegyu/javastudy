package ch15.sec02.exam01;

public class Board {

		private String subject;
		private String contect;
		private String writer;
		
		
		public Board(String subject, String contect, String writer) {
			super();
			this.subject = subject;
			this.contect = contect;
			this.writer = writer;
		
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContect() {
			return contect;
		}
		public void setContect(String contect) {
			this.contect = contect;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;}
		
}