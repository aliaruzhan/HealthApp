package com.example.health

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {
    private var restTimer: CountDownTimer?= null
    private var restProgress = 0
    private var count = 0

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
        setupRestView()
    }

    override fun onDestroy() {
        if(restTimer != null) {
            restTimer!!.cancel()
            restProgress = 0
        }
        super.onDestroy()
    }

    private fun setRestProgressBar(){
        progressBar.progress = restProgress
        restTimer = object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                restProgress ++
                progressBar.progress = 10 - restProgress
                tvTimer.text = (10 - restProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@SecondActivity, "Start Exercising!",Toast.LENGTH_SHORT).show()
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

    private fun setupActionView(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setAbdominalCrunchProgressBar()
    }

    private fun setAbdominalCrunchProgressBar(){
        count++
        getready.text=" Exercise 1 "
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction1View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setHighKneesProgressBar()
    }

    private fun setHighKneesProgressBar(){
        count++
        getready.text=" Exercise 2"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction2View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setJumpingJacksProgressBar()
    }

    private fun setJumpingJacksProgressBar(){
        count++
        getready.text=" Exercise 3"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction3View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setLungeProgressBar()
    }

    private fun setLungeProgressBar(){
        count++
        getready.text=" Exercise 4 "
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction4View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPlankProgressBar()
    }

    private fun setPlankProgressBar(){
        count++
        getready.text=" Exercise 5 "
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction5View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPushUpProgressBar()
    }

    private fun setPushUpProgressBar(){
        count++
        getready.text=" Exercise 6"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction6View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setPushAndRotateProgressBar()
    }

    private fun setPushAndRotateProgressBar(){
        count++
        getready.text=" Exercise 7"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction7View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setSidePlankProgressBar()
    }

    private fun setSidePlankProgressBar(){
        count++
        getready.text=" Exercise 8"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction8View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setSquatProgressBar()
    }

    private fun setSquatProgressBar(){
        count++
        getready.text=" Exercise 9"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction9View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setStepUpProgressBar()
    }

    private fun setStepUpProgressBar(){
        count++
        getready.text=" Exercise 10"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction10View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setTricepsDipProgressBar()
    }

    private fun setTricepsDipProgressBar(){
        count++
        getready.text=" Exercise 11"
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
                Toast.makeText(this@SecondActivity, "Rest for 10 seconds!",Toast.LENGTH_SHORT).show()
                setupRestView()
            }
        }.start()
    }

    private fun setupAction11View(){
        if(restTimer != null){
            restTimer!!.cancel()
            restProgress = 0
        }
        tvTimer.text="30"
        progressBar.max=30
        setWallSitProgressBar()
    }

    private fun setWallSitProgressBar(){
        getready.text="Last Exercise"
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
                Toast.makeText(this@SecondActivity, "Finish Exercising!",Toast.LENGTH_SHORT).show()
            }
        }.start()
    }

}