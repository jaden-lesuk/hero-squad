public class Hero{
  private String mName;
  private String mSecretIdentity;
  private String mSex;
  private int mAge;
  private String mPowers;
  private String mImage;

  public Hero(String name, String secretIdentity, String sex, int age, String powers, String image){
    mName = name;
    mSecretIdentity = secretIdentity;
    mSex = sex;
    mAge = age;
    mPowers = powers;
    mImage = image;
  }

  public String getName(){
    return mName;
  }

  public String getSecretIdentity(){
    return mSecretIdentity;
  }

  public String getSex(){
    return mSex;
  }

  public int getAge(){
    return mAge;
  }

  public String getPowers(){
    return mPowers;
  }

  public String getImage(){
    return mImage;
  }
}