package com.example.health

import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class ExercisesActivity: AppCompatActivity(), TextToSpeech.OnInitListener {
    private var restTimer: CountDownTimer?= null
    private var restProgress = 0
    private var count = 0
    private lateinit var mediaPlayer: MediaPlayer
    private var tts: TextToSpeech? = null

    override fun onInit(status: Int) {
        if(status == TextToSpeech.SUCCESS){
            val result = tts!!.setLanguage(Locale.US)

            if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Log.e("TTS", "The language specified is not supported")
            }
        } else{
            Log.e("TTS","Initialization Failed")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar_exercise_activity)
        val actionbar = supportActionBar
        if(actionbar != null){
            actionbar.setDisplayHomeAsUpEnabled(true)
        }
        toolbar_exercise_activity.setNavigationOnClickListener{
            onBackPressed()
        }
        tts = TextToSpeech(this, this)
        
        setupRestView()
    }

    override fun onDestroy() {
        if(restTimer != null ) {
            restTimer!!.cancel()
            restProgress = 0
        }

        if(tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }

    private fun setRestProgressBar(){
        progressBar.progress = restProgress
        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.press_start)
        mediaPlayer!!.isLooping = false // Sets the player to be looping or non-looping.
        mediaPlayer!!.start() // Starts Playback.
        restTimer = object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 10 - restProgress
                tvTimer.text = (10 - restProgress).toString()
            }

            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Start Exercising!",Toast.LENGTH_SHORT).show()
                when(count){
                    0 -> setupActionView()
                    1 -> setupAction1View()
                    2 -> setupAction2View()
                    3 -> setupAction3View()
                    4 -> setupAction4View()
                    5 -> setupAction5View()
                    6 -> setupAction6View()
                    7 -> setupAction7View()
                    8 -> setupAction8View()
                    9 -> setupAction9View()
                    10 -> setupAction10View()
                    11 -> setupAction11View()
                }

            }
        }.start()
    }

    private fun setupRestView(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        getready.text = "Get Ready For"
        exercise_image.visibility = View.INVISIBLE
        setRestProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupActionView(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setAbdominalCrunchProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setAbdominalCrunchProgressBar(){
        count++
        getready.text="Abdominal Crunch"
        speakout("Abdominal Crunch")
        exercise_image.setImageResource(R.drawable.ic_abdominal_crunch)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction1View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setHighKneesProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setHighKneesProgressBar(){
        count++
        getready.text="High Knees Running In Place"
        speakout("High knees running in place")
        exercise_image.setImageResource(R.drawable.ic_high_knees_running_in_place)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction2View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setJumpingJacksProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setJumpingJacksProgressBar(){
        count++
        getready.text="Jumping Jacks"
        speakout("Jumping jacks")
        exercise_image.setImageResource(R.drawable.ic_jumping_jacks)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction3View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setLungeProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setLungeProgressBar(){
        count++
        getready.text="Lunge"
        speakout("Lunge")
        exercise_image.setImageResource(R.drawable.ic_lunge)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction4View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPlankProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setPlankProgressBar(){
        count++
        getready.text=" Plank Progress"
        speakout("Plank Progress")
        exercise_image.setImageResource(R.drawable.ic_plank)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction5View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPushUpProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setPushUpProgressBar(){
        count++
        getready.text="Push Up"
        speakout("Push Up")
        exercise_image.setImageResource(R.drawable.ic_push_up)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction6View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPushAndRotateProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setPushAndRotateProgressBar(){
        count++
        getready.text="Push Up and Rotation"
        speakout("Push Up and Rotation")
        exercise_image.setImageResource(R.drawable.ic_push_up_and_rotation)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction7View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setSidePlankProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setSidePlankProgressBar(){
        count++
        getready.text="Side Plank"
        speakout("Side Plank")
        exercise_image.setImageResource(R.drawable.ic_side_plank)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction8View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setSquatProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setSquatProgressBar(){
        count++
        getready.text="Squat"
        speakout("Squat")
        exercise_image.setImageResource(R.drawable.ic_squat)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction9View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setStepUpProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setStepUpProgressBar(){
        count++
        getready.text="Step up onto chair"
        speakout("step up onto chair")
        exercise_image.setImageResource(R.drawable.ic_step_up_onto_chair)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction10View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setTricepsDipProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setTricepsDipProgressBar(){
        count++
        getready.text="Triceps dip on chair"
        speakout("Triceps dip on chair")
        exercise_image.setImageResource(R.drawable.ic_triceps_dip_on_chair)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupAction11View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setWallSitProgressBar()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setWallSitProgressBar(){
        getready.text="Wall Sit Progress Bar"
        speakout("Last Exercise. Well done")
        exercise_image.setImageResource(R.drawable.ic_wall_sit)
        exercise_image.visibility = View.VISIBLE
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(30000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 30 - restProgress
                tvTimer.text = (30 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExercisesActivity, "Finish Exercising!",Toast.LENGTH_SHORT).show()
            }
        }.start()
    }

   @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
   private fun speakout(text: String){
       tts!!.speak(text, TextToSpeech.QUEUE_FLUSH,null, "")
   }



}