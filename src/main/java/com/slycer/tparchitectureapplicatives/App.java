package com.slycer.tparchitectureapplicatives;


import com.slycer.tparchitectureapplicatives.Controller.VolumeController;

public class App  {

    public static void main(String[] args) {
        VolumeModel model = newVolumeModel(50);
        VolumeController controller= newVolumeController(model);
        controller.displayViews();
    }
}