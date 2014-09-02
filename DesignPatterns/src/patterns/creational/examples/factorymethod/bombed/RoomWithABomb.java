package patterns.creational.examples.factorymethod.bombed;

import patterns.creational.examples.Room;

public class RoomWithABomb extends Room
{
	public RoomWithABomb( int roomNo )
	{
		super( roomNo );
	}
	
	@Override
	public void enter()
	{
		System.out.print("RoomWithABomb: ");
		super.enter();
	}
}
