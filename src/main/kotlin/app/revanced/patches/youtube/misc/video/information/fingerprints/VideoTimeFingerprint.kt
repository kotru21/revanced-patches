package app.revanced.patches.youtube.misc.video.information.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import app.revanced.patches.youtube.layout.sponsorblock.annotations.SponsorBlockCompatibility
import app.revanced.patches.youtube.misc.video.information.annotation.VideoInformationCompatibility

@Name("video-time-fingerprint")
@VideoInformationCompatibility
@Version("0.0.1")
object VideoTimeFingerprint : MethodFingerprint(
    strings = listOf("MedialibPlayerTimeInfo{currentPositionMillis=")
)