package emu.grasscutter.game.props.ItemUseAction;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.props.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class ItemUseOpenRandomChest extends ItemUseInt {
    public ItemUseOpenRandomChest(String[] useParam) {
        super(useParam);
    }

    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_OPEN_RANDOM_CHEST;
    }

    @Override
    public boolean useItem(UseItemParams params) { // cash shop material bundles
        var data = params.player.getServer().getShopSystem().getShopChestData(this.i);
        if (data == null) return false;
        var rewardItems = new ArrayList<GameItem>();
        var reliquaryItems = new ArrayList<ItemParamData>();

        for (var itemParamData : data) {
            var itemData = GameData.getItemDataMap().getOrDefault(itemParamData.getItemId(), null);
            if (itemData != null) {
                if (Objects.requireNonNull(itemData.getItemType()) == ItemType.ITEM_RELIQUARY) {
                    reliquaryItems.add(itemParamData);
                } else {
                    rewardItems.add(new GameItem(itemParamData));
                }
            }
        }

        if (!reliquaryItems.isEmpty()) {
            rewardItems.add(new GameItem(reliquaryItems.get(new Random().nextInt(reliquaryItems.size()))));
        }


        if (!rewardItems.isEmpty()) {
            params.player.getInventory().addItems(rewardItems, ActionReason.Shop);
        }
        return true;
    }
}
