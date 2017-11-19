package java_practice;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<E> {
	private List<E> taskList;

	public GenericStack(){
		taskList = new ArrayList<>();
	}

	public boolean push(E task){
		return taskList.add(task);
	}

	// pop: 末尾からデータを取得する
	public E pop(){
		if(taskList.isEmpty()){
			return null; // 要素が1つも登録されていない場合はnullを返す
		}
		return taskList.remove(taskList.size()-1); // 末尾からデータを取得して返す
	}

}
