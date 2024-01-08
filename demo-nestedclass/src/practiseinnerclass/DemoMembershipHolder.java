public class DemoMembershipHolder {

  public static void main(String[] args) {

    MembershipHolder thomas = new MembershipHolder("Thomas");
    thomas.setMemberShip(MemberClass.GOLD);
    System.out.println(thomas);
    System.out.println();


    MembershipHolder thomas2 = new MembershipHolder("Thomas");
    thomas2.setMemberShip(MemberClass.PLATNUM);
    System.out.println(thomas2);
    System.out.println();

    thomas.demoInnerClassAccess();

    // MembershipHolder.Membership membership1 = new MembershipHolder("Thomas"). new Membership();
    // System.out.println(membership1.getMemberClass());
    // membership1.print();


  }

}
