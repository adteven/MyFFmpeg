package module.video.jnc.myffmpeg;

import android.opengl.GLSurfaceView;
import android.util.Log;

/**
 * Created by xhc on 2017/11/1.
 */

public class FFmpegUtils {

    static {
        System.loadLibrary("avutil");
        System.loadLibrary("avcodec");
        System.loadLibrary("avformat");
        System.loadLibrary("swresample");
        System.loadLibrary("swscale");
        System.loadLibrary("avfilter");
        System.loadLibrary("my_ffmpeg");
        System.loadLibrary("soundtouch");
    }
    public static native String stringNative();

    //将MP4解码成yuv，和pcm
    public static native int decodeMp4ToYuv(String path , Object glSurfaceView);

    public static native int openSLTest(String path);

    //播放或者暂停 false暂停，true播放
    public static native int openSLPauseOrPlay(boolean flag);

    public static native int openSLDestroy();

    public static native int decodeMp4ToYuvShowShader(String path , Object glSurfaceView);

    public static native int videoAudioDecodeShow(String path , Object glSurfaceView);

    public static native int testMyShow();

    public static native int testNativeThread();
    public static native int testNativeThreadFree();
    public static native int testNativeThreadRun();

    public static native int testCPlusPlusThread();

    public static native int showVideoGpuAudioOpensl(String path ,  Object glSurfaceView);
    public static native int showVideoGpuDestroy();
    public static native int showVideoGpuJustPause();
    public static native int showVideoGpuPlayOrPause();
    public static native int showVideoGpuSeek(double seek);
    //最大值一百，分别按比例处理
    public static native int getPlayPosition();
    public static native String getVersionString();




    private void printMsgFromJni(String str){
        Log.e("xhc_jni" ,str);
//        return "x";
    }
}
