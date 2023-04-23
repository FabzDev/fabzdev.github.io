package coursePractice.generics;

public class User extends Number implements Comparable<User> {
	  private int points;

	  public User(int points) {
	    this.points = points;
	  }

	  @Override
	  public int compareTo(User other) {
	    return points - other.points;
	  }

	  @Override
	  public String toString() {
	    return "Points=" + points;
	  }

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	}
