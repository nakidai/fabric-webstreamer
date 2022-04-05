package fr.theorozier.webstreamer.display.client;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import java.net.URI;

@Environment(EnvType.CLIENT)
public class DisplayUrlManager {

    private final Object2IntArrayMap<URI> urlCache = new Object2IntArrayMap<>();
    private int counter = 0;

    public int allocUri(URI uri) {
        return this.urlCache.computeIfAbsent(uri, key -> ++counter);
    }

}
