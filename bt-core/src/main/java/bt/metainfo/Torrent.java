package bt.metainfo;

import bt.tracker.AnnounceKey;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * @since 1.0
 */
public interface Torrent {

    /**
     * @since 1.3
     */
    TorrentSource getSource();

    /**
     * @return Announce key, or {@link Optional#empty()} for trackerless torrents
     * @since 1.1
     */
    Optional<AnnounceKey> getAnnounceKey();

    /**
     * @return Torrent ID.
     * @since 1.0
     */
    TorrentId getTorrentId();

    /**
     * @return Suggested name for this torrent.
     * @since 1.0
     */
    String getName();

    /**
     * @return Size of a chunk, in bytes.
     * @since 1.0
     */
    long getChunkSize();

    /**
     * @return Sequence of SHA-1 hashes of all chunks in this torrent.
     * @since 1.0
     */
    Iterable<byte[]> getChunkHashes();

    /**
     * @return Total size of all chunks in this torrent, in bytes.
     * @since 1.0
     */
    long getSize();

    /**
     * @return Information on the files contained in this torrent.
     * @since 1.0
     */
    List<TorrentFile> getFiles();

    /**
     * @return True if this torrent is private (see BEP-27)
     * @since 1.0
     */
    boolean isPrivate();

    /**
     * @return Creation time of the torrent
     * @since 1.5
     */
    Optional<Instant> getCreationDate();

    /**
     * @return Creator of the torrent (usually name and version of the program used to create the .torrent file)
     * @since 1.5
     */
    Optional<String> getCreatedBy();
}
