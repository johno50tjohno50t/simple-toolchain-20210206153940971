package com.masterwok.simplevlcplayer.contracts

import android.view.SurfaceView

import org.videolan.libvlc.IVLCVout
import org.videolan.libvlc.Media
import org.videolan.libvlc.RendererItem

import java.io.FileDescriptor

interface VlcMediaPlayer : MediaPlayer {

    val vout: IVLCVout

    val selectedRendererItem: RendererItem?

    val currentVideoTrack: Media.VideoTrack?

    val media: Media?

    fun setMedia(fileDescriptor: FileDescriptor?)

    fun attachSurfaces(
            surfaceMedia: SurfaceView,
            surfaceSubtitles: SurfaceView,
            layoutListener: IVLCVout.OnNewVideoLayoutListener
    )

    fun detachSurfaces()

    fun setRendererItem(rendererItem: RendererItem?)

    fun setVolume(volume: Int)

    fun setAspectRatio(aspectRatio: String?)

    fun setScale(scale: Float)
}