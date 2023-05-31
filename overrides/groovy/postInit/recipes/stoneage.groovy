
//removals

//vanilla planks - NoTreePunching
crafting.remove("notreepunching:saw_planks_1")
crafting.remove("notreepunching:saw_planks_2")
crafting.remove("notreepunching:saw_planks_3")
crafting.remove("notreepunching:saw_planks_4")
crafting.remove("notreepunching:saw_planks_5")
crafting.remove("notreepunching:saw_planks_6")

//Forestry

//I have serious concerns over the person who thought adding this was a good idea.
crafting.remove("forestry:bronze_ingot")

//Added Recipes

//Vanilla Crafting

/*
 structure for shapeless:
 crafting.addShapeless(String name, ItemStack output, List<IIngredient> input)

 Structure for shaped (example):
 crafting.addShaped('balanced_clay', item('minecraft:clay_ball') * 3, [
        [item('minecraft:nether_star'), null, item('minecraft:nether_star')],
        [null, ore('ingotIron'), null],
        [item('minecraft:nether_star'), null, item('minecraft:nether_star')]
])
 */

def oak_planks = item('minecraft:planks', 0)
def oak_logs = item('minecraft:log', 0)

def spruce_planks = item('minecraft:planks', 1)
def spruce_logs = item('minecraft:log', 1)

def birch_planks = item('minecraft:planks', 2)
def birch_logs = item('minecraft:log', 2)

def jungle_planks = item('minecraft:planks', 3)
def jungle_logs = item('minecraft:log', 3)

def acacia_planks = item('minecraft:planks', 4)
def acacia_logs = item('minecraft:log', 4)

def dark_oak_planks = item('minecraft:planks', 5)
def dark_oak_logs = item('minecraft:log', 5)


crafting.addShapeless('planks_1', oak_planks * 2, [oak_logs])
crafting.addShapeless('planks_2', spruce_planks * 2, [spruce_logs])
crafting.addShapeless('planks_3', birch_planks * 2, [birch_logs])
crafting.addShapeless('planks_4', jungle_planks * 2, [jungle_logs])
crafting.addShapeless('planks_5', acacia_planks * 2, [acacia_logs])
crafting.addShapeless('planks_6', dark_oak_planks * 2, [dark_oak_logs])

//clay block to clay
crafting.addShapeless('clayball4x', item('minecraft:clay_ball') * 4, [item('minecraft:clay')])


//GregTech

