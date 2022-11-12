package lab5.task_5_1.menu;

import lab5.task_5_1.fs.FileSystem;
import lab5.task_5_1.strprocessor.StringProcessorModel;

public class MenuCountroller {
	
	private final MenuModel model;
	private final MenuView view;
	
	public MenuCountroller(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}
	
	public void launch(FileSystem fr, StringProcessorModel sp) {
		model.addControllers(fr, sp);

	}
}
