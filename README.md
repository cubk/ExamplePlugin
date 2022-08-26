# Tarico API 文档
## 关于tarico api
我们正在积极的开发tarico客户端的API，用于创建更多tarico客户端的模块和命令，如果您认为tarico客户端的API缺少您需要的功能，请发起issue。

## 功能
### 已经实现：
- 基本的模块与命令
- 基本的游戏内操作访问
- 输入输出

### 即将实现
- 高级数据包操作
- 完全游戏Class控制
- Gui与HUD

## tarico插件开发
### 创建工作区
1. 打开您的IDE比如eclipse或者intelliJ
2. 导入tarico客户端的jar文件
3. 在src的根目录创建一个名为plugin.jar的文件，需要包含以下内容

```json
{
  "main": "插件主类",
  "name": "插件名称",
  "version": "插件版本"
}
```

例如

```json
{
  "main": "dev.tarico.example.Main",
  "name": "Example Plugin",
  "version": "1.0.0"
}
```
在做完上述工作之后即可开始编写代码

### 创建Main Class

在新建plugin.json后，在src目录下创建你的Package，创建一个Class并实现(implements)```dev.tarico.api.pluginapi.Plugin```，然后```@Override```onLoad和onUnload方法

**注意：Main Class必须和plugin.json内的main字段的类名一致**

Example:
```java
package dev.tarico.example;

import dev.tarico.api.pluginapi.Plugin;
import dev.tarico.api.pluginapi.PluginAPI;
import dev.tarico.example.command.CommandName;
import dev.tarico.example.module.AutoJump;
import dev.tarico.example.module.ForceSprint;
import dev.tarico.example.module.LTap;

public class Main implements Plugin {

    @Override
    public void onLoad() {
	//此处执行初始化插件操作，在客户端初始化时执行
	System.out.println("Hello world!");
    }

    @Override
    public void onUnload() {
	//此处执行在插件禁用时的操作
        System.out.println("GoodBye!");
    }
}
```

### Event
目前TaricoAPI针对Module(模块)提供了四个Event，在Module内Override这些方法即可实现客户端功能
```java
	// 每个Client Tick调用，适用于Sprint等功能
    	public void onTick() {
    	}

	// 客户端渲染2D视觉时调用，适用于渲染2D视觉（例如HUD）
    	public void onRender2D(float partialTicks) {
    	}
	
	// 客户端渲染3D视觉时调用，适用于渲染3D视觉（例如ESP、NameTag）
    	public void onRender3D(float partialTicks) {
    	}

	// 客户端玩家实体更新时调用
    	public void onUpdate(float yaw, float pitch, double y, boolean onGround) {
    	}

	// 键盘输入时调用
    	public void onKey() {
    	}
```
