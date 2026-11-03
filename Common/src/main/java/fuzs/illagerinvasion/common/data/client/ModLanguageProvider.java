package fuzs.illagerinvasion.common.data.client;

import fuzs.illagerinvasion.common.IllagerInvasion;
import fuzs.illagerinvasion.common.init.ModEntityTypes;
import fuzs.illagerinvasion.common.init.ModItems;
import fuzs.illagerinvasion.common.init.ModRegistry;
import fuzs.illagerinvasion.common.init.ModSoundEvents;
import fuzs.illagerinvasion.common.world.inventory.ImbuingMenu;
import fuzs.illagerinvasion.common.world.level.block.ImbuingTableBlock;
import fuzs.puzzleslib.common.api.client.data.v3.language.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations() {
        this.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, IllagerInvasion.MOD_NAME);
        this.add(ImbuingTableBlock.CONTAINER_IMBUE, "Imbue");
        this.add(ImbuingMenu.ImbuingState.ENCHANTED_BOOK_MISSING.getComponent(), "%s is missing!");
        this.add(ImbuingMenu.ImbuingState.HALLOWED_GEM_MISSING.getComponent(), "%s is missing!");
        this.add(ImbuingMenu.ImbuingState.TOO_MANY_ENCHANTMENTS.getComponent(), "Book has too many enchantments!");
        this.add(ImbuingMenu.ImbuingState.INVALID_ENCHANTMENT.getComponent(), "Book enchantment cannot be imbued!");
        this.add(ImbuingMenu.ImbuingState.ENCHANTMENTS_NOT_MATCHING.getComponent(), "Enchantments do not match!");
        this.add(ImbuingMenu.ImbuingState.LEVELS_NOT_EQUAL.getComponent(), "Enchantment levels are not equal!");
        this.add(ModItems.LOST_CANDLE_ITEM.value().getDescriptionId() + ".foundNearby", "%s found nearby");
        this.add(ModRegistry.REVEAL_INSTRUMENT, "Reveal");
        this.add(ModRegistry.PLATINUM_TRIM_MATERIAL, "Platinum Material");
        this.add(ModItems.UNUSUAL_DUST_ITEM.value(), "Unusual Dust");
        this.add(ModItems.MAGICAL_FIRE_CHARGE_ITEM.value(), "Magical Fire Charge");
        this.add(ModItems.ILLUSIONARY_DUST_ITEM.value(), "Illusionary Dust");
        this.add(ModItems.LOST_CANDLE_ITEM.value(), "Lost Candle");
        this.add(ModItems.HORN_OF_SIGHT_ITEM.value(), "Horn of Sight");
        this.add(ModItems.HALLOWED_GEM_ITEM.value(), "Hallowed Gem");
        this.add(ModItems.PLATINUM_INFUSED_HATCHET_ITEM.value(), "Platinum Infused Hatchet");
        this.add(ModItems.PLATINUM_CHUNK_ITEM.value(), "Platinum Chunk");
        this.add(ModItems.PLATINUM_SHEET_ITEM.value(), "Platinum Sheet");
        this.add(ModItems.PRIMAL_ESSENCE_ITEM.value(), "Primal Essence");
        this.addPotion(ModRegistry.BERSERKING_POTION, "Berserking");
        this.add(ModItems.PROVOKER_SPAWN_EGG_ITEM.value(), "Provoker Spawn Egg");
        this.add(ModItems.SURRENDERED_SPAWN_EGG_ITEM.value(), "Surrendered Spawn Egg");
        this.add(ModItems.ILLUSIONER_SPAWN_EGG_ITEM.value(), "Illusioner Spawn Egg");
        this.add(ModItems.NECROMANCER_SPAWN_EGG_ITEM.value(), "Necromancer Spawn Egg");
        this.add(ModItems.BASHER_SPAWN_EGG_ITEM.value(), "Basher Spawn Egg");
        this.add(ModItems.SORCERER_SPAWN_EGG_ITEM.value(), "Sorcerer Spawn Egg");
        this.add(ModItems.ARCHIVIST_SPAWN_EGG_ITEM.value(), "Archivist Spawn Egg");
        this.add(ModItems.INQUISITOR_SPAWN_EGG_ITEM.value(), "Inquisitor Spawn Egg");
        this.add(ModItems.MARAUDER_SPAWN_EGG_ITEM.value(), "Marauder Spawn Egg");
        this.add(ModItems.INVOKER_SPAWN_EGG_ITEM.value(), "Invoker Spawn Egg");
        this.add(ModItems.ALCHEMIST_SPAWN_EGG_ITEM.value(), "Alchemist Spawn Egg");
        this.add(ModItems.FIRECALLER_SPAWN_EGG_ITEM.value(), "Firecaller Spawn Egg");
        this.add(ModRegistry.IMBUING_TABLE_BLOCK.value(), "Imbuing Table");
        this.add(ModRegistry.MAGIC_FIRE_BLOCK.value(), "Magic Fire");
        this.add(ModEntityTypes.PROVOKER_ENTITY_TYPE.value(), "Provoker");
        this.add(ModEntityTypes.INVOKER_ENTITY_TYPE.value(), "Invoker");
        this.add(ModEntityTypes.SURRENDERED_ENTITY_TYPE.value(), "Surrendered");
        this.add(ModEntityTypes.NECROMANCER_ENTITY_TYPE.value(), "Necromancer");
        this.add(ModEntityTypes.BASHER_ENTITY_TYPE.value(), "Basher");
        this.add(ModEntityTypes.SORCERER_ENTITY_TYPE.value(), "Sorcerer");
        this.add(ModEntityTypes.ARCHIVIST_ENTITY_TYPE.value(), "Archivist");
        this.add(ModEntityTypes.INQUISITOR_ENTITY_TYPE.value(), "Inquisitor");
        this.add(ModEntityTypes.MARAUDER_ENTITY_TYPE.value(), "Marauder");
        this.add(ModEntityTypes.ALCHEMIST_ENTITY_TYPE.value(), "Alchemist");
        this.add(ModEntityTypes.FIRECALLER_ENTITY_TYPE.value(), "Firecaller");
        this.add(ModEntityTypes.SKULL_BOLT_ENTITY_TYPE.value(), "Skull Bolt");
        this.add(ModEntityTypes.HATCHET_ENTITY_TYPE.value(), "Hatchet");
        this.add(ModEntityTypes.INVOKER_FANGS_ENTITY_TYPE.value(), "Invoker Fangs");
        this.add(ModEntityTypes.FLYING_MAGMA_ENTITY_TYPE.value(), "Flying Magma");
        this.add(ModSoundEvents.HORN_OF_SIGHT_SOUND_EVENT.value(), "Horn of Sight blows");
        this.add(ModSoundEvents.LOST_CANDLE_FIND_ORE_SOUND_EVENT.value(), "Ore rings");
        this.add(ModSoundEvents.SURRENDERED_AMBIENT_SOUND_EVENT.value(), "Surrendered clanks");
        this.add(ModSoundEvents.SURRENDERED_HURT_SOUND_EVENT.value(), "Surrendered hurts");
        this.add(ModSoundEvents.SURRENDERED_CHARGE_SOUND_EVENT.value(), "Surrendered charges");
        this.add(ModSoundEvents.SURRENDERED_DEATH_SOUND_EVENT.value(), "Surrendered dies");
        this.add(ModSoundEvents.NECROMANCER_SUMMON_SOUND_EVENT.value(), "Necromancer summons");
        this.add(ModSoundEvents.ARCHIVIST_AMBIENT_SOUND_EVENT.value(), "Archivist murmurs");
        this.add(ModSoundEvents.ARCHIVIST_HURT_SOUND_EVENT.value(), "Archivist hurts");
        this.add(ModSoundEvents.ARCHIVIST_DEATH_SOUND_EVENT.value(), "Archivist dies");
        this.add(ModSoundEvents.INVOKER_FANGS_SOUND_EVENT.value(), "Fangs attack");
        this.add(ModSoundEvents.INVOKER_HURT_SOUND_EVENT.value(), "Invoker hurts");
        this.add(ModSoundEvents.INVOKER_DEATH_SOUND_EVENT.value(), "Invoker dies");
        this.add(ModSoundEvents.INVOKER_AMBIENT_SOUND_EVENT.value(), "Invoker murmurs");
        this.add(ModSoundEvents.INVOKER_COMPLETE_CAST_SOUND_EVENT.value(), "Invoker casts");
        this.add(ModSoundEvents.INVOKER_TELEPORT_CAST_SOUND_EVENT.value(), "Invoker casts");
        this.add(ModSoundEvents.INVOKER_FANGS_CAST_SOUND_EVENT.value(), "Invoker casts");
        this.add(ModSoundEvents.INVOKER_BIG_CAST_SOUND_EVENT.value(), "Invoker casts");
        this.add(ModSoundEvents.INVOKER_SUMMON_CAST_SOUND_EVENT.value(), "Invoker casts");
        this.add(ModSoundEvents.INVOKER_SHIELD_BREAK_SOUND_EVENT.value(), "Shield breaks");
        this.add(ModSoundEvents.INVOKER_SHIELD_CREATE_SOUND_EVENT.value(), "Shield summoned");
        this.add(ModSoundEvents.ILLAGER_BRUTE_AMBIENT_SOUND_EVENT.value(), "Illager Brute grunts");
        this.add(ModSoundEvents.ILLAGER_BRUTE_HURT_SOUND_EVENT.value(), "Illager Brute hurts");
        this.add(ModSoundEvents.ILLAGER_BRUTE_DEATH_SOUND_EVENT.value(), "Illager Brute dies");
        this.add(ModSoundEvents.PROVOKER_AMBIENT_SOUND_EVENT.value(), "Provoker murmurs");
        this.add(ModSoundEvents.PROVOKER_HURT_SOUND_EVENT.value(), "Provoker hurts");
        this.add(ModSoundEvents.PROVOKER_DEATH_SOUND_EVENT.value(), "Provoker dies");
        this.add(ModSoundEvents.PROVOKER_CELEBRATE_SOUND_EVENT.value(), "Provoker celebrates");
        this.add(ModSoundEvents.BASHER_AMBIENT_SOUND_EVENT.value(), "Basher murmurs");
        this.add(ModSoundEvents.BASHER_HURT_SOUND_EVENT.value(), "Basher hurts");
        this.add(ModSoundEvents.BASHER_DEATH_SOUND_EVENT.value(), "Basher dies");
        this.add(ModSoundEvents.BASHER_CELEBRATE_SOUND_EVENT.value(), "Basher celebrates");
        this.add(ModSoundEvents.FIRECALLER_AMBIENT_SOUND_EVENT.value(), "Firecaller murmurs");
        this.add(ModSoundEvents.FIRECALLER_HURT_SOUND_EVENT.value(), "Firecaller hurts");
        this.add(ModSoundEvents.FIRECALLER_DEATH_SOUND_EVENT.value(), "Firecaller dies");
        this.add(ModSoundEvents.FIRECALLER_CAST_SOUND_EVENT.value(), "Firecaller casts");
        this.add(ModSoundEvents.SORCERER_CAST_SOUND_EVENT.value(), "Sorcerer casts");
        this.add(ModSoundEvents.SORCERER_COMPLETE_CAST_SOUND_EVENT.value(), "Sorcerer casts");
        this.add(ModSoundEvents.SORCERER_HURT_SOUND_EVENT.value(), "Sorcerer hurts");
        this.add(ModSoundEvents.SORCERER_DEATH_SOUND_EVENT.value(), "Sorcerer dies");
        this.add(ModSoundEvents.SORCERER_AMBIENT_SOUND_EVENT.value(), "Sorcerer murmurs");
        this.add(ModSoundEvents.SORCERER_CELEBRATE_SOUND_EVENT.value(), "Sorcerer celebrates");
    }
}
