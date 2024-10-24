package com.google.developers.wallet.rest

import com.google.developers.wallet.rest.Common.LOGI
import java.io.File

//Gradle daemon 无法启动修复:https://blog.csdn.net/weixin_44189056/article/details/135961183

private const val userId = "3388000000022787184"
private const val classSuffix = "classSuffix13"
private const val objectSuffix = "objectSuffix13"
const val TAG = "WalletAPI"
val demo = DemoGeneric()


@Throws(Exception::class)
fun main(args: Array<String>) {

    //创建卡片,会先检测卡片是否已经创建(通过检查userId、classId、objectId是否改变),如果已经创建,不再重复创建
    createCard()

    //更新卡片,前提需要(userId、objectId)卡片已经创建
    //demo.updateObjectAutoLinkPass(userId, classSuffix, objectSuffix)

    //向(userId, classId)卡片推送消息,前提需要(userId、classId)卡片已经创建
    //demo.sendMessage(userId, classId)

    //生成JWT,返回客户端
    val tokenPair = demo.createJWTNewObjects(userId, classSuffix, objectSuffix)
    saveTokenToFile(tokenPair.second)
}


private fun createCard() {
    demo.createClass(userId, classSuffix)
    demo.createObject(userId, classSuffix, objectSuffix)
}

private fun saveTokenToFile(content: String) {
    runCatching {
        val filePath =
            "/Users/chenzirui/workspace/wallet-android-codelab/android_complete/app/src/main/assets/token.txt"
        File(filePath).writeText(content)
        LOGI(TAG, "写入完毕");
    }
}