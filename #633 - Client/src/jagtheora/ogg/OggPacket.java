/* OggPacket - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPacket extends SimplePeer {
	public final native boolean isTheora();

	public final native int isKeyFrame();

	public final native boolean isVorbis();

	protected final native void clear();

	public final native int isHeader();

	public final native byte[] getData();
}
