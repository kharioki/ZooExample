Dear Manager,  
  
Our new Accra Zoo is opening next week. Please Hire 4 ZooKeepers for the new Zoo. make sure that among the zoo keepers, there is at least one ZooKeeper who can feed lions, one ZooKeeper who can feed Tigers, and one ZooKeeper who can feed bears. I'd also like you to buy me 3 Lions, 3 Tigers, and 3 Bears.
  
Please make sure that all of the animals are fed twice a day. If they're sick, feed them three times because they have trouble keeping their nutrients down.  
  
Warmly Yours,  
Zoo Owner  
  
P.S. Everybody knows that Lions roar, and tigers growl.  

  
  

Create a Zoo that's filled with Animals like Lion, Tiger, and Bear. Zoo should also have Zookeepers who are trained to feed and care for certain animals.  
  
  
Class Zoo  
  
Interface Animal  
    void feed()  
    int getTimesFed()  
    boolean isSick()  
    String getName()  
    void setName(String name)  
  
class Lion  
    String name;  
    int age;  
    Date lastFed;  
  
    String getName()  
    void setName(String name)  
    String setAge()  
    void setName(String name)  
  
ZooKeeper  
    String name;  
    ArrayList<Class> training;  
    boolean isWorking;  
  
    void feedAnimal(Animal animal);  
    boolean isWorking();  
    boolean setWorking(boolean isWorking);    
    boolean canFeed(Class animal);  
    void addTraining(Class animal);  
  
Name  
    String lastName;  
    String firstName;  
  
    Name(String fullName)  
    Name(String firstName, String lastName)  