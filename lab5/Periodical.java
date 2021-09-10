/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        5
*/

// 2021-09-10

public class Periodical extends Item {
	private int issueNum;

	public Periodical() {
		super();
		issueNum = 0;
	}

	public Periodical(String title, int issueNum) {
		super(title);
		this.issueNum = issueNum;
	}

	public int getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}

	public String getListing() {
		return "Periodical Title - " + getTitle() + "\nIssue # - " + issueNum;
	}
}
