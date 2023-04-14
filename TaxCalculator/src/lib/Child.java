package lib;

public class Child {
    List<String> childNames;
	List<String> childIdNumbers;

    public Child() {
        childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}