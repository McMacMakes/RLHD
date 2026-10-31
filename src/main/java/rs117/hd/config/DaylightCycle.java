package rs117.hd.config;

import javax.annotation.Nullable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DaylightCycle {
	OFF("Off", null, LatLonSource.DEFAULT),
	DEFAULT("Default", null, LatLonSource.DEFAULT),
	REAL_TIME("Real-time", null, LatLonSource.CONFIG),
	PLAYER_POSITION("Player Position", null, LatLonSource.PLAYER),
	CUSTOM("Custom", null, LatLonSource.CONFIG),
	DAWN("Dawn", "DAWN", LatLonSource.DEFAULT),
	SUNRISE("Sunrise", "SUNRISE", LatLonSource.DEFAULT),
	DAY("Day", "DAY", LatLonSource.DEFAULT),
	SUNSET("Sunset", "SUNSET", LatLonSource.DEFAULT),
	DUSK("Dusk", "DUSK", LatLonSource.DEFAULT),
	NIGHT("Night", "NIGHT", LatLonSource.DEFAULT),
	;

	public enum LatLonSource { DEFAULT, CONFIG, PLAYER }

	private final String name;
	@Nullable
	public final String fixedSkyPreset;
	public final LatLonSource latLonSource;

	@Override
	public String toString() {
		return name;
	}
}
