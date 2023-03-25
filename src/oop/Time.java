package oop;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public Time nextSecond() {
		Time time = new Time(hour, minute, second);
		if(time.second < 59) {
			time.second++;
		} 
		else {
			time.second = 0;
			if(time.minute < 59)
				time.minute++;
			else {
				time.minute = 0;
				if(time.hour < 23) 
					time.hour++;
				else {
					time.hour = 0;
				}
			}
		}
		return time;
	}
	public void previousSecond() {
		Time time = new Time(hour, minute, second);
		if(time.second > 0) {
			time.second--;
		}
		else {
			time.second = 0;
			if(time.minute > 0)
				time.minute++;
			else {
				time.minute = 0;
				if(time.hour > 23) 
					time.hour++;
				else {
					time.hour = 0;
				}
			}
		}
	}
}
