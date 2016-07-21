package jackywathy24.factorycraft.PowerAPI;

import jackywathy24.factorycraft.PowerAPI.PowerCore.return_status;

public interface PowerSender {
	public return_status sendPower(int amount); // sends the power into a wire or tube or machine
	public int hasPower(); // returns the amount of power left
	
}
