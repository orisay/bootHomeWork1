package com.jaeguni.homework.dto;

public class ScoreDTO {

	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer total;
	private Double avg; 
	
	
	public ScoreDTO() {
		super();
	}
	
	public ScoreDTO(String name, Integer kor, Integer eng, Integer math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = (double)(Math.round(kor + eng + math)/3);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
        if (total == null) {
            total = kor + eng + math;
        }
        return total;
    }

    public double getAvg() {
        if (avg == null) {
            avg = (double)(kor + eng + math) / 3;
        }
        return avg;
    }
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScoreDTO [name=");
		builder.append(name);
		builder.append(", kor=");
		builder.append(kor);
		builder.append(", eng=");
		builder.append(eng);
		builder.append(", math=");
		builder.append(math);
		builder.append(", total=");
		builder.append(total);
		builder.append(", avg=");
		builder.append(avg);
		builder.append("]");
		return builder.toString();
	}




	
	
}
