import java.util.Objects;

public class MembershipHolder {


  private Membership membership;
  private String name;

  public MembershipHolder(String name) {
    this.membership = new Membership();
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Membership getMembership() {
    return this.membership;
  }

  // outer class attribute's inner class object could access the private instance method of inner class
  public String membership() {
    // return this.membership.getMember();
    return this.membership.getMember();
  }

  // Inner class object instantiated by outer class object could access the private methods of inner class.
  public int memberNumber() {
    return this.membership.getMemberNumber();
  }

  public void setMemberShip(MemberClass memberClass) {
    this.membership.setMember(memberClass);
  }

  // Demo inner class object accessing outer class member
  public void demoInnerClassAccess() {
    this.membership.print();
  }

  @Override
  public String toString() {
    return "MembershipHolder( Name=" + this.name + ", "
        + this.membership.toString() + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof MembershipHolder))
      return false;

    MembershipHolder member = (MembershipHolder) obj;

    return Objects.equals(this.name, member.getName())
        && Objects.equals(this.membership, member.getMembership());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.membership);
  }

  // inner nested class should be private for encapsulation.
  private class Membership {

    private MemberClass memberClass;
    private int memberNumber;
    private static int memberCounter = 10000;

    private Membership() {
      this.memberClass = MemberClass.CLASSIC;
      this.memberNumber = ++Membership.memberCounter;
      // this.memberNumber = Membership.memberCounter;
    }

    private void setMember(MemberClass memberClass) {
      this.memberClass = memberClass;
    }

    private String getMember() {
      return this.memberClass.name();
    }

    public int getMemberNumber() {
      return this.memberNumber;
    }

    public MemberClass getMemberClass() {
      return this.memberClass;
    }

    // Demo on accessing outer class' members
    public void print() {
      System.out.println("name=" + name + ", membership=" + membership.getMember() + ", member number=" + membership.getMemberNumber());
    }

    @Override
    public String toString() {
      return "Membership( membership number=" + this.memberNumber
          + ", member class=" + this.memberClass.name() + ")";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;

      if (!(obj instanceof Membership))
        return false;

      Membership member = (Membership) obj;

      return Objects.equals(this.memberNumber, member.getMemberNumber())
          && Objects.equals(this.memberClass, member.getMemberClass());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.memberNumber, this.memberClass);
    }
  }

}