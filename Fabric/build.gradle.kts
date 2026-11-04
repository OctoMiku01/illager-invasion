plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-fabric")
}

dependencies {
    modApi(sharedLibs.fabricapi.fabric)
    modApi(sharedLibs.puzzleslib.fabric)
    modApi(sharedLibs.multiloaderdataextensions.fabric)
    include(sharedLibs.multiloaderdataextensions.fabric)
}

multiloader {
    mixins {
        mixin("Raid\u0024RaiderTypeFabricMixin")
    }
}

loom {
    runs.configureEach {
        // Minecraft 26.3 launches with -XX:StackShadowPages=32 (see its version JSON), newer Loom versions add it too.
        // Without it the native shader compiler (shaderc / spirv-cross) randomly crashes the dev client under OpenGL.
        vmArg("-XX:StackShadowPages=32")
    }
}
