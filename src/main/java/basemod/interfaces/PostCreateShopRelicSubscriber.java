package basemod.interfaces;

import java.util.ArrayList;

import com.megacrit.cardcrawl.shop.ShopScreen;
import com.megacrit.cardcrawl.shop.StoreRelic;

public interface PostCreateShopRelicSubscriber {
	void receiveCreateShopRelics(ArrayList<StoreRelic> relics, ShopScreen screenInstance);
}
