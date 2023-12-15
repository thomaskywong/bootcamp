public enum ExamResult {

  PASS('P'),
  NONPASS('NP'),

  private char grade;

  private ExamResult(char grade) {
    this.grade = grade;
  }

  public char getGrade() {
    return this.grade;
  }


  
}
